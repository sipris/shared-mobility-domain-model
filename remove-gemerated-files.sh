#!/bin/bash
echo "removing generated files in this workspace:" $(pwd)
rm -v -r ./workspace/shared-mobility-domain-model/bundles/org.sharedmobility.domainmodel/src/
rm -v -r ./workspace/shared-mobility-domain-model/bundles/org.sharedmobility.domainmodel.edit/src/
rm -v -r ./workspace/shared-mobility-domain-model/bundles/org.sharedmobility.domainmodel.editor/src/
