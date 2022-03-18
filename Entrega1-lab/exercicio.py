from math import sqrt

print("Entre com o numero da operação desejada:")
op = input("1- Operação de soma \n" + "2- Operação de subtração \n"+ "3- Operação de multiplicação \n"+ 
           "4- Operação de divisão \n"+ "5- Operação de raiz \n")

if(op == "1"):
  a = int(input("Entre com o primeiro valor que deseja fazer a soma "))
  b = int(input("Entre com o segundo valor que deseja fazer a soma "))
  soma = a+b
  print("A soma desses valores eh: ", soma)

elif(op == "2"):
  a = int(input("Entre com o primeiro valor que deseja fazer a subtração "))
  b = int(input("Entre com o segundo valor que deseja fazer a subtração "))
  sub = a-b
  print("A subtração desses valores eh: ", sub)

elif(op == "3"):
  a = int(input("Entre com o primeiro valor que deseja fazer a multiplicação "))
  b = int(input("Entre com o segundo valor que deseja fazer a multiplicação "))
  mult = a*b
  print("A multiplicação desses valores eh: ", mult) 

elif(op == "4"):
  a = int(input("Entre com o primeiro valor que deseja fazer a divisão "))
  b = int(input("Entre com o segundo valor que deseja fazer a divisão "))
  div = a/b
  print("A divisão desses valores eh: ", div) 

elif(op == "5"):
  a = int(input("Entre com o valor que deseja calcular a raiz quadrada "))
  print("A raiz quadrada desse numero eh: ", sqrt(a)) 
