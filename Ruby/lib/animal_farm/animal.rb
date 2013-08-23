module AnimalFarm
  class Animal
    def speak
      return ""
    end

    def eat(food)
    	if(can_eat(food))
    		stomach_contents = food;
    	end
    end

    def can_eat(food)
		return true;
    end
  end
end

