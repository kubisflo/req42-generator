rm -r build/*
rm -r dist/*
rm -rf null

echo "START: createTemplatesFromGoldenMaster"
gradle createTemplatesFromGoldenMaster
echo "END: createTemplatesFromGoldenMaster"

echo "START: req42"
gradle req42
echo "END: req42"

echo "START: createDistribution"
gradle createDistribution
echo "END: createDistribution"

echo "please check the results in dist"
echo "and if ok, add, commit and push it"
