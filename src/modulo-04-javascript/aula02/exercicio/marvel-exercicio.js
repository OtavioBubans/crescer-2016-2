class Heroi{
    constructor(herois){
      this.herois = herois;
    }

  /* 2 -Escreva um método foraDaGuerraCivil() de instância da classe Herois que retorna um array com todos
  aqueles personagens que NÃO participaram da guerra civíl.Para saber quando um personagem participou
  da guerra civíl, basta procurar no seu array events por algum item que tenha 'Civil War' dentro da string.
  */

  foraDaGuerraCivil(){

    for(let i = 0; i < herois.length; i++){

      let heroisFora = [];
      for(let evento in herois[i]){
        if(events.itens[evento].name !== 'Civil War';){
          heroisFora += herois[i];
        }
      }
    }
  }// fim do metodo foraDaGuerraCivil

  /* 3 -Escreva um método maisPublicado() de instância da classe Herois que retorna o objeto personagem
    (não é preciso criar classe) que mais possui histórias em quadrinhos publicadas.
    Para saber a quantidade de histórias em quadrinhos, utilize a propriedade available de comics.
    Desconsidere a diferença entre os items dentro de comics e o valor de available,
    pois tivemos que reduzir a quantidade de comics trazidos na coleção, para ficar mais leve o array.
  */

  maisPublicado(){

    let maior = 0;
    let personagem;
    for(let i = 0; i < herois.length; i++){
      if(herois[i].comics.available > maior){
        maior = herois[i].comics.available;
        personagem = herois[1].name;
      }
    }
  } // fim metodo maisPublicado
}
