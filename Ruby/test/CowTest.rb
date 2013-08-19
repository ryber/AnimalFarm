require "../lib/AnimalFarm/Cow"
require "test/unit"

class CowTest < Test::Unit::TestCase
	def aCowSaysMoo
		assert_equal("Quack", Cow.new.speak())
	end
end