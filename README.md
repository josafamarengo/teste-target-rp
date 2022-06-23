1. Observe o trecho de código abaixo:

```javascript
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```

K+1 | SOMA
:---:|:---:
1 | 1
2 | 3
3 | 6
4 | 10
5 | 15
6 | 21
7 | 28
8 | 36
9 | 45
10 | 55
11 | 66
12 | 78
13 | 91

> Ao final do processamento, qual será o valor da variável SOMA?   **91**



---


2. Dado a sequência de Fibonacci, onde se inicia por **0** e **1** e o próximo valor sempre será a soma dos **2** valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.



>IMPORTANTE:
>
>Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

---

3. Descubra a lógica e complete o próximo elemento:



> a) 1, 3, 5, 7, ___ **9**
>
> n = (n-1) + 2

> b) 2, 4, 8, 16, 32, 64, ____**128**
>
> n = (n-1) * 2

> c) 0, 1, 4, 9, 16, 25, 36, ____**49**
>
> 0², 1² , 2², 3², 4², 5², 6², ____**7²**

> d) 4, 16, 36, 64, ____**100**
>
> n, n+x, n+(x+8)

> e) 1, 1, 2, 3, 5, 8, ____**13**
>
> Fibonacci: n = (n-1) + (n-2)

> f) 2,10, 12, 16, 17, 18, 19, ____**200**
>
> Dois, Dez, Doze, Dezesseis, Dezessete, Dezoito, Dezenove, Duzentos

---

4. Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



>IMPORTANTE:
>
>* Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca
>
>* Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
>
>* Explique como chegou no resultado.

> R= Quando eles se cruzarem, ambos estarão a mesma distância de Ribeirão Preto. Logo após se cruzarem, caso continuem nas direções iniciais, o caminhão, então estará mais próximo.


---
 

5) Escreva um programa que inverta os caracteres de um string.



>IMPORTANTE:
>
>* Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
>
>* Evite usar funções prontas, como, por exemplo, reverse;