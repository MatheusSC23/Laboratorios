class Main{
        public static void main(String arg[]){
                Expressao op1, op2, op3, op4, op5;

                op1 = new Operando(2);
                op2 = new Divisao();
                op3 = new Multipĺicacao();
                op4 = new Operando(5);
                op5 = new Operando(10);

                op3.adicionar(op1, op4);
                op2.adicionar(op5, op1);

                System.out.println(op3.calcular());
                System.out.println(op2.calcular());
        }
}
