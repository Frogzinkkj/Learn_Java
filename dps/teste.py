import random

while True:
  x= input("Advinhe o numero que estou pensando de 1 a 10:\n")
  numero = random.randint(1, 10)
  if x == numero:
      print("Parabens, você acertou!")
  else:
      print("Você errou, o numero era", numero)