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
      let personagem;
      for(let evento in herois[i]){
        if(herois[i].events.itens[evento].name !== 'Civil War'){
          heroisFora += herois[i];
          personagem = this.herois[i].name;
        }
      }
      return
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
      if(this.herois[i].comics.available > maior){
        maior = this.herois[i].comics.available;
        personagem = this.herois[i].name;
      }
    }
  } // fim metodo maisPublicado


// dadosHerois. reduce ((ac,heroi) => heroi.comics.available,0)

// daddosHeroi.map(heroi => heroi.comics.avaible);


// marvel[i].comics.itens[i].pageCount.

/* 4 - Escreva uma função mediaPaginas() de instância da classe Herois que retorna a média de páginas
    de todos quadrinhos dos personagens. Utilize a propriedade pageCount da comic.
*/
  mediaPaginas(){

      let arrayPersonagens = [];

      for(let i = 0; i < herois.length; i++){
      //  herois[i].reduce(( ac, itens) => itens.comic.pageCount,0 );



      }

  }



  /*  5- Escreva um método seriesPorLongevidade de instância da classe Herois
      que retorna todas as séries dos personagens ordenadas por tempo de atividade descendente,
      ou seja, as séries que ficaram / estão há mais tempo sendo produzidas vêm primeiro.
      Para saber a longevidade de uma série, basta utilizar os campos startYear e endYear da série.
  */

  seriesPorLongevidade(){

  }



  /*  6 - Escreva um método comicMaisCara de instância da classe Herois que retorna
      o objeto comic mais caro entre todos personagens.
      Para descobrir o preço total de um comic, some todo seu array prices
  */

  comicMaisCara(){
    let maior;

    for( let i = 0; i < herois.length; i++){
      // dadosHerois. reduce ((ac,heroi) => heroi.comics.available,0)
      herois.reduce((ac, heroi) => heroi.comics.avaible,0);
    }
  }
}
