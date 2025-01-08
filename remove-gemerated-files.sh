#!/bin/bash
echo "removing generated files in this workspace:" $(pwd)
rm -v -r ./bundles/org.sharedmobility.domainmodel/src/
rm -v -r ./bundles/org.sharedmobility.domainmodel/bin/
rm -v -r ./bundles/org.sharedmobility.domainmodel.edit/src/
rm -v -r ./bundles/org.sharedmobility.domainmodel.edit/bin/
rm -v -r ./bundles/org.sharedmobility.domainmodel.editor/src/
rm -v -r ./bundles/org.sharedmobility.domainmodel.editor/bin/
