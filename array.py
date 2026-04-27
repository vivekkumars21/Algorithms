from array import *

var = array('i',[1,2,3,4,5,6])

print(var)
var.append(50)
var.insert(2,10)
var[3] = 100

copyArray = array(var.typecode, (x for x in var))  #first loop took element put in x then x from starting is storing all elements in list
multipleArray = array(copyArray.typecode, (x*3 for x in copyArray)) 

for x in multipleArray:
    print(x)

