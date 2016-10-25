// Exercicio 4  - Crie uma função chamada subtrair que realiza a subtração
// de dois números em duas chamadas de funções diferentes.

//Versão  correção de aula - não consegui em casa

function subtrair(num1){
  return function (num2){
    return num1 - num2;
  }
}
