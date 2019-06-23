package 练习1;

public class AnimalImpl implements Tiger,Rabbit{

	@Override
	public String eating() {
		return null;
	}

	@Override
	public void grassAnimal() {
		System.out.println("兔子食草");
	}

	@Override
	public void sleep() {
		System.out.println("动物都会睡觉,老虎和兔子也不例外");
		
	}

	@Override
	public void eatAnimal() {
		System.out.println("老虎食肉");
		
	}


}

