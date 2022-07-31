const livros = require("./listaLivros")
const menorValor = require("./menorValor")

for (let atual = 0; atual < livros.length - 1; atual++) {
  let menor = menorValor(livros, atual)

  let livroAtual = livros[atual]
  console.log(livros[atual], "livro atual")
  let livroMenorPreco = livros[menor]
  console.log(livros[menor], "livro menor preco")

  livros[atual] = livroMenorPreco
  livros[menor] = livroAtual
}

console.log(livros)
