class Soma extends OperadorBinario{

	Soma(Expression e,Expression d){
		super(e,d);
	}

	@Override
	public double calcular(){
		return e.calcular() + d.calcular();
	}
}
