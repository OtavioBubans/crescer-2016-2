
// Exercicio 5 - Escreva uma função iguais que recebe dois parâmetros e retorna true apenas se os valores
// dos parâmetros forem iguais ou se eles forem objetos com as mesmas propriedades com valores
// iguais e assim recursivamente (ou seja, em até vários níveis de propriedades dentro dos objetos).


function ehObjeto(obj) {
  return typeof obj === 'object';

}

function iguais(obj1, obj2) {

  if (ehObjeto(obj1) && ehObjeto(obj2)) {
    // se tiverem quantidades de campos diferentes, já retorna falso
    if (Object.keys(obj1).length !== Object.keys(obj2).length) {
      return false;
    }

    // comparando recursivamente propriedades;
    for (let prop in obj1) {

      let saoIguais = iguais(obj1[prop], obj2[prop]);
      if (!saoIguais) return false;
    }
    return true;
  }

  return obj1 === obj2;
}
 
