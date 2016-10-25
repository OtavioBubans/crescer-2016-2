
//exercicio 1 - Escreva uma função gerarPiramide(niveis) que imprime com console.log
// uma pirâmide com uma quantidade de níveis informada por parâmetro, utilizando os caracteres
function gerarPiramide(niveis){

var valor = 'R$';
var resultado ='';

for ( i = 0; i < niveis; i++){
  resultado += valor;
  console.log(resultado);
}
}
//  gerarPiramide(prompt('Escolha quantos niveis da piramide',''));


//Execicio 2
//Escreva uma função diglettDig() que, utilizando console.log, imprime todos os números de 1 até 100, com duas exceções:
//quando o número for divisível por 3, imprima 'Diglett dig' invés do número, e
//quando o número for divisível por 5 (e não por 3), imprima 'trio trio trio' invés do número.

function diglettDig(){

  for(i = 0; i < 100; i++){

    if(i%3 === 0 && i%5===0){
      console.log('Diglett dig, trio trio trio');
    }else if(i%3 === 0){
      console.log('Diglett dig');
    }else if (i%5 === 0){
    console.log('trio trio trio');
    }else {
    console.log(i);
    }
  }
}
// diglettDig();


//Exercicio 3 - Crie uma função chamada find que recebe um array e uma função por parâmetro.
//A função (passada por parâmetro) deverá informar um critério de busca de elementos dentro do
//array e a função find utilizará este critério para retornar todos elementos do array que encontram-se dentro dele.
/*
var menornumero = function(){
}

var arrayAletorio = [1,2,'a','d',null, undefined,{pais: 'Brasil'}, {pi:3.14},5];

function find(arrayAletorio,menornumero() ;

*/

// Exercicio 4  - Crie uma função chamada subtrair que realiza a subtração
// de dois números em duas chamadas de funções diferentes.

function subtrair(num1,num2){
  return num1 - num2;
}

//console.log(subtrair(prompt(), prompt()));


// Exercicio 5 - Escreva uma função iguais que recebe dois parâmetros e retorna true apenas se os valores
// dos parâmetros forem iguais ou se eles forem objetos com as mesmas propriedades com valores
// iguais e assim recursivamente (ou seja, em até vários níveis de propriedades dentro dos objetos).



// Exercicio 6 - Escreva uma função ctrlC que recebe um parâmetro e
// realiza a cópia de todos seus valores e retorne o resultado.

 function ctrlC(elemento){
   var copia = elemento;
   return copia;
 }

 var a = [2,6,'t',{y:'coisas'}];

 console.log(ctrlC(a));
