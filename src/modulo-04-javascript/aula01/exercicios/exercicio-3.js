//Exercicio 3 - Crie uma função chamada find que recebe um array e uma função por parâmetro.
//A função (passada por parâmetro) deverá informar um critério de busca de elementos dentro do
//array e a função find utilizará este critério para retornar todos elementos do array que encontram-se dentro dele.

//Versão de coreção de aula  - não consegui fazer em casa

var maiorQueUm = function(elem) {
  return elem > 1;
};

find([ 1, 3, 2 ], 'jabulani');

function find(array, fnFiltro) {

  let resultado = [];
  if (typeof fnFiltro === 'function') {
    for (let i = 0; i < array.length; i++) {
      let encontrou = fnFiltro(array[i]);
      if (encontrou) {
        resultado.push(array[i]);
      }
    }
  }
  return resultado;
}
