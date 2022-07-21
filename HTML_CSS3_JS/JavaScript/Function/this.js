function calculaIdade(anos) {
    return `Daqui a ${anos}, ${this.nome} terá ${this.idade + anos} anos de idade.`;
}

const pessoa1 = {
    nome: 'Talita',
    idade: 25,
}

const pessoa2 = {
    nome: 'Miguel',
    idade: 1,
}

console.log(calculaIdade.call(pessoa1, 5));
console.log(calculaIdade.apply(pessoa2, [5]));