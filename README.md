# قبل اي حاجه محتاجين نعرف التعريفات دي:
## ايه هو ال Binding:
  - هو عملية ربط object بال class الخاص بيه عشان ال application يبدأ يتعامل بال implementations اللي موجوده في ال class ده.
## ايه هو ال Static Binding (Early Binding):
  - اسمها early عشان بتحصل في ال compilation time قبل ما ال application يشتغل و بالتالي ال compiler بيكون قادر يحدد ال class بتاع
		ال object قبل حتي ال Application مايشتغل, و اسمها static برضه عشان بمجرد لما بتحصل مش بتتغير وقت ال runtime.
## ايه هو ال Dynamic Binding (Late Binding):
  - اسمها late عشان بتحصل في ال runtime بعد ما ال application يشتغل و بالتالي ال compiler مش بيكون عارف يحدد ال class بتاع ال object لحد
		ما ال applicaion يشتغل, و اسمها dynamic برضه لانها قابله للتغيير في خلال ال runtime.
## الاستنتاج:
  - اللي نفهمه من اللي فات ان في حالة ال dynamic binding بيكون في حالة غموض حول ال class اللي ال object بينتمي ليه, و ده اللي ال compiler 
	مش بيسمح بيه عشان كده بيشتغل ديما بال static binding.
  - في الapplication احنا عندنا Shape و ليه 2 subclasses و هما Circle و Square, لما عملنا object من نوع shape ال compiler استخدم ال static binding 
  و من خلاله حكم ال object ده نوعه shape و انه مش هيستني لحد لما يعرف في ال runtime ايه ال implementation اللي اتحط فيه سواء shape او واحد من ال subclasses بتوعه و بالتالي ديما هيستخدم
  ال print method اللي بتاخد patameter من نوع shape في ال class بتاع ال Printer.
# ايه هو ال Single Dispatch:
  - هو اننا نعمل call ل method من class معين, مثلا زي ما خلينا ال printer يعمل call لل print method.
# ايه هو بقي ال Double Dispatch:
  - هو عباره عن خدعه لطيفه بنخلي method من جوا ال class هي اللي تعمل call لل print method الخاصه بال class ده, مثلا زي ماعملنا
	في ال applicaion ده اننا عملنا call لل accept method و خليناها هي اللي تعمل call لل print method و بالتالي استخدم ال print method الخاصه بال circle class.
  - ال Double Dispatch هو اساس عمل ال Visitor Design Pattern و فيه ال Printer Class ده اسمه Visitor و ال Shape لازم يكون بيدعم ال Visiting بمعني يكون 
  فيه ال accept method.
 # Links:
   - [Referance](https://refactoring.guru/design-patterns/visitor-double-dispatch)
   - [Visitor Design Pattern](https://github.com/poula-atef/DesignPatterns-Behavioral-Visitor)
