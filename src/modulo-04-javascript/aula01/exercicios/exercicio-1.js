// Exercicio 1 - Escreva uma função gerarPiramide(niveis) que imprime com console.log
// uma pirâmide com uma quantidade de níveis informada por parâmetro, utilizando os caracteres

function gerarPiramide(niveis){

  var valor = 'R$';
  var resultado ='';

  for ( i = 0; i < niveis; i++){
    resultado += valor;
    console.log(resultado);
  }
}
