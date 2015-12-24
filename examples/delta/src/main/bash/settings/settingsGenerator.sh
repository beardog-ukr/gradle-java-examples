#!/bin/bash

#   This script is supposed to read YAML config file and convert it into INI
# However  it's fake (demo purposes only), so it will just write some
# lines to INI file

# usage should be
# settingsGenerator.sh [yaml config filename] [ini config filename]


yamlFileName=$1
iniFileName=$2

# some unix magic here
cat $yamlFileName | grep -E "^\\s*[[:alnum:]]+:\\s\"[[:alnum:]]+\".*$" | sed 's/:\s*/=/g' | sed 's/^\s\s//g' > $iniFileName
