
const arr1 = [1,2,3,4];
const arr2 = [5,6,7,8];

// console.log(arr1.concat(arr2));
const newArr = [];
for(let i= 0 ; i<arr1.length ; i++){
    newArr.push(arr1[i]);
}

for(let i= 0 ; i<arr2.length ; i++){
    newArr.push(arr2[i]);
}

console.log(newArr);