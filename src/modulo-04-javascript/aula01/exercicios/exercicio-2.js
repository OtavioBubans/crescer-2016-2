//Execicio 2
//Escreva uma função diglettDig() que, utilizando console.log, imprime todos os números de 1 até 100, com duas exceções:
//quando o número for divisível por 3, imprima 'Diglett dig' invés do número, e
//quando o número for divisível por 5 (e não por 3), imprima 'trio trio trio' invés do número.

function diglettDig(){

  for(i = 0; i <= 100; i++){

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
