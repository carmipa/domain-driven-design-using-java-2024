2.3 De acordo com o MER criado na questão 2.1, escreva o código SQL capaz de
consultar todos PEDIDOs ordenados de forma decrescente pela quantidade.
select * 
from pedido 
order by quantidade_produto desc;

2.4 De acordo com o MER criado na questão 2.1, escreva o código SQL capaz de
consultar as NOTA FISCAIS de um determinado cliente.

select *
from cliente, nota_fiscal
where cliente.cod_cliente = nota_fiscal.cod_notafiscal 
and nota_fiscal.cod_notafiscal in (1);

2.5 De acordo com o MER criado na questão 2.1, escreva o código SQL capaz de
buscar todos clientes que não possuem nenhuma NOTA FISCAL.

select *
from cliente, nota_fiscal
where cliente.cod_cliente = nota_fiscal.cod_notafiscal 
and nota_fiscal.cod_notafiscal in null;

3. Envie sua conta no GitHub (http://github.com) com a solução do problema
proposto. Opcionalmente submeta o código em outro social coding de sua
preferência.
Instruções:
Use a linguagem que preferir, desde que orientada a objetos.
O teste é classificatório, não eliminatório, logo, responda o que souber.
Escreva tudo que achar relevante, nos comentários dos códigos.