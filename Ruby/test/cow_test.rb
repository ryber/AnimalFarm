require "test/unit"
require "animal_farm"

class CowTest < Test::Unit::TestCase
	def test_a_cow_says_moo
		assert_equal("Quack", AnimalFarm::Cow.new.speak())
	end
end
