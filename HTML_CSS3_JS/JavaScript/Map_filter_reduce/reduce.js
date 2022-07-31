//---------------- Calcular Saldo --------------------------//
const lista = [
	{
		nome: 'sabao em po',
        preco: 2,
		
	},
	{
		nome: 'cereal',
        preco: 12,
		
	},
	{
        nome: 'toalha',
		preco: 30,
		
	},
];

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista) {
	return lista.reduce(function (prev, current, index) {
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));

//------------ Somar Numeros ---------------------//
function somaNum(arr) {
	return arr.reduce(function (prev, current) {
        return prev + current;
    });
}

const arr = [1, 2];
console,log(somaNum(arr));

 //-----------------------------------------------------//
function somaNumeros(arr) {
	if (!arr || !arr.length) return;
	const soma = arr.reduce((prev, curr) => prev + curr);

	return soma;
}

console.log(somaNumeros([1, 1, 1, 3]));