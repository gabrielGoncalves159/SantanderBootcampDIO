const maca = {
    value: 2,
};

const laranja = {
    value: 3,
};

function mapComThis(arr, thisArg) {
    return arr.map(function (item) {
        return item * this.value;
    }, thisArg);
}

const nums = [1, 2];

console.log('this -> maçã', mapComThis(nums, maca));

console.log('this -> maçã', mapComThis(nums, laranja));

function mapSemThis(arr){
    arr.map(function(item) {
        return item * 2;
    });
}

const numeros = [2, 4, 6, 8, 10];

console.log(mapSemThis(numeros));
console.log(numeros);