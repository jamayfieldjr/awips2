# Copy alertviz to the AWIPS II directory.
Copy-Item ${A2_PREPARE_CAVE_DIR}\alertviz -destination ${A2_AWIPSII_DIR} -recurse -force
if ($? -ne $true) { EXIT 1; }

# Add WiX to the path.
$ENV:PATH += ";${WIX_EXE_DIR}"

pushd .
cd ${A2_STAGING_DIR}
# Run 'heat' for alertviz.
heat dir 'AWIPS II' -dr AwipsII -cg AWIPSII_ALERTVIZ -out AWIPSII_ALERTVIZ.wxs -gg -sreg -srd
if ($? -ne $true) { EXIT 1; }
popd

# Temporarily remove alertviz.
Remove-Item -recurse -force ${A2_AWIPSII_DIR}\alertviz
if ($? -ne $true) { EXIT 1; }

# Copy cave to the AWIPS II directory.
Copy-Item ${A2_PREPARE_CAVE_DIR}\cave -destination ${A2_AWIPSII_DIR} -recurse -force
if ($? -ne $true) { EXIT 1; }

pushd .
cd ${A2_STAGING_DIR}
# Run 'heat' for cave.
heat dir 'AWIPS II' -dr AwipsII -cg AWIPSII_CAVE -out AWIPSII_CAVE.wxs -gg -sreg -srd
if ($? -ne $true) { EXIT 1; }

# Temporarily remove cave.
Remove-Item -recurse -force ${A2_AWIPSII_DIR}\cave
if ($? -ne $true) { EXIT 1; }

# Move the .wxs files to the Wix Project Directory.
Move-Item -path ${A2_STAGING_DIR}\*.wxs -destination ${A2_WIX_PROJECT_DIR} -force
if ($? -ne $true) { EXIT 1; }

popd

# Move alertviz to the AWIPS II directory.
Copy-Item ${A2_PREPARE_CAVE_DIR}\alertviz -destination ${A2_AWIPSII_DIR} -recurse -force
if ($? -ne $true) { EXIT 1; }

# Move cave to the AWIPS II directory.
Copy-Item ${A2_PREPARE_CAVE_DIR}\cave -destination ${A2_AWIPSII_DIR} -recurse -force
if ($? -ne $true) { EXIT 1; }

# Move the launcher to the AWIPS II directory.
Copy-Item ${A2_STAGING_DIR}\VisualStudio\VizLauncher.exe -destination ${A2_AWIPSII_DIR} -force
if ($? -ne $true) { EXIT 1; }

pushd .
# Build the MSI Installer.
cd ${A2_WIX_PROJECT_DIR}
$ENV:PATH += ";${MS_BUILD_EXE_DIR}"
MSBuild AWIPSII.wixproj /p:Version=${AWIPS2_VERSION} /p:StagingDirectory="${A2_AWIPSII_DIR}"
if ($? -ne $true) { EXIT 1; }

# Cleanup the AWIPS II Staging Directory.
Remove-Item -recurse -force ${A2_AWIPSII_DIR}\alertviz
if ($? -ne $true) { EXIT 1; }
Remove-Item -recurse -force ${A2_AWIPSII_DIR}\cave
if ($? -ne $true) { EXIT 1; }
Remove-Item -force ${A2_AWIPSII_DIR}\VizLauncher.exe
if ($? -ne $true) { EXIT 1; }

popd