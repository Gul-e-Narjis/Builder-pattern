# Summary of Changes

## 1. Run Linked Example in IDE
- The original builder pattern implementation was cleaned up and fully structured to compile and run correctly in any standard Java IDE.

## 2. Support Diet Versions for Diabetics
- Added support for diabetic customers by introducing:
  - `DietCoke` class (subclass of `ColdDrink`)
  - `DietPepsi` class (subclass of `ColdDrink`)

## 3. Add Another Hot Drink - Tea
- Introduced a new hot drink:
  - `Tea` class (implements `Item` interface and uses `Cup` for packing)

## 4. Make Tea Decoratable with Sweetness, Cream, and Spoons Count
- Made `Tea` a decoratable beverage:
  - Created a base class `Tea` implementing `Item`
  - Created decorators:
    - `WithCream` (adds cream and cost)
    - `WithSweetener` (adds sweetener based on number of spoons and cost)
  - Each decorator wraps the base `Item` and adds specific price adjustments

## 5. Make System Interactive
- Rewrote `BuilderPatternDemo` to accept console input from user via `Scanner`
- User can now:
  - Choose Veg or Non-Veg meal
  - Specify if they are diabetic
  - Optionally add Tea with custom cream/sugar configurations

##  Modified Java Files
- ✅ `Item.java` (unchanged)
- ✅ `Packing.java` (unchanged)
- ✅ `Wrapper.java` & `Bottle.java` (unchanged)
- ✅ `MealBuilder.java` (added support for diabetic drinks)
- ✅ `Meal.java` (fixed structure and logic)
- ✅ `DietCoke.java`, `DietPepsi.java` (new classes)
- ✅ `Tea.java`, `WithCream.java`, `WithSweetener.java` (new hot drink and decorators)
- ✅ `BuilderPatternDemo.java` (rewritten to be interactive)

