class Subtracao extends OperadorBinario{

	Soma(Expression e,Expression d){
		super(e,d);
	}

	double calcular(){
		return e.calcular() - d.calcular();
	}
}
