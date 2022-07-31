const livros = require("./listaLivros")

let atual = 0
let indiceMaior = 0

for (atual = 0; atual < livros.length; atual++) {
  if (livros[atual].preco < livros[indiceMaior].preco) {
    indiceMaior = atual
  }
}

console.log(
  `O livro mais barato: ${livros[indiceMaior].titulo}, ${livros[indiceMaior].preco}`
)
// module.exports = precosLivros
