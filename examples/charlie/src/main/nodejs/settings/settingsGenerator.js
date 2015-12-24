// This script takes yaml config and creates some ini file .

var program = require('commander');

var fs = require('fs');
var yamljs = require('yamljs');

//=============================================================================

program
  .version('0.0.1')
  .option('-c, --config [filename]', 'Config file in yaml format')
  .option('-r, --result [dirname]', 'Folder to store newly generated config')

  .parse(process.argv);




if (!program.config) {
  console.log('Config list file name incorrect');
  process.exit(1);
}

if (!program.result) {
  console.log('Result folder name incorrect');
  process.exit(1);
}

// ============================================================================
// Functions ==================================================================
// ============================================================================



// ============================================================================
// Main =======================================================================
// ============================================================================

var conf = yamljs.load(program.config);

// This is good enough for demo project, but really some additional checks should be done here
var iniContent = conf.settings[0].id + "=" + conf.settings[0].str + "\n";
iniContent += conf.settings[1].id + "=" + conf.settings[1].str + "\n";

var fcfn = program.result + '/settings.ini' ;
fs.writeFile(fcfn, iniContent, function (err) {
  if (err) {
    console.log('Failed to write ' + fcfn + ' : ' + err.toString() );
  }
});
