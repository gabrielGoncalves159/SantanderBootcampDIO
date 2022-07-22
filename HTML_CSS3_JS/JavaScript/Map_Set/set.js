const meuArray = [30, 30, 40, 5, 223, 2049, 3034, 5];

function valoresUnicos(arr) {
    const mySet = new Set(arr);

    // Spread: uma forma de lidar separadamente com elementos, enviando os elementos separadamentes como parâmetros
    // Rest: combina os elementos separados em um array. colocando ele na '...' junto ao paramentro na function.
    return [...mySet];
}

console.log(valoresUnicos(meuArray));