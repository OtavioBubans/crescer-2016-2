console.log('Olá "JS"!');

var elfo = { nome:'Legolas', experiencia:1}
 console.log("Nome: 'oi'", elfo.nome);
elfo.flechas=42;

console.log(elfo.flechas);

delete elfo.nome;
elfo.flechas=undefined;

elfo['Nome Completo'] = 'Legolas da Silva';

elfo.atirarFlecha = function(dwarf, opt, boolean, batman){
  opt();
  dwarf.vida -= 10;
  elfo.experiecia++;
  return dwarf;
}

var outraFuncao = function(){
  console.log('oi');
};

var dwarf = elfo.atirarFlecha({vida:110}, outraFuncao);

console.log(elfo,dwarf);

elfo.nome='Fincfli';
