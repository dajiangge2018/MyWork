package org.jiang.builder;

/**
 * @author 15012
 *������
 */
public class NutritionFacts {
	private  int servingSize=0;
	private  int servings = 0;
	private  int calories= 0;
	private  int fat= 0;
	private  int sodium= 0;
	private  int carbohydrate= 0;
	
	public static class Builder{
		private  int servingSize=0;
		private  int servings = 0;
		private  int calories= 0;
		private  int fat= 0;
		private  int sodium= 0;
		private  int carbohydrate= 0;
		
		public Builder(int servingSize ,int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories =val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings =builder.servings;
		calories	=builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	
	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}


	public static void main(String[] args) {
		NutritionFacts  cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(cocaCola.toString());
	}
	
}
