<html>
<body>
<script>
	function plus(){
	   var a = parseInt(document.getElementById("num1").value);
	   var b = parseInt(document.getElementById("num2").value);
	   document.getElementById("res").innerHTML=a+b;
	}
	function minus(){
		   var a = parseInt(document.getElementById("num1").value);
		   var b = parseInt(document.getElementById("num2").value);
		   document.getElementById("res").innerHTML=a-b;
		}
	function mul(){
		   var a = parseInt(document.getElementById("num1").value);
		   var b = parseInt(document.getElementById("num2").value);
		   document.getElementById("res").innerHTML=a*b;
		}
	function divid(){
		   var a = parseInt(document.getElementById("num1").value);
		   var b = parseInt(document.getElementById("num2").value);
		   document.getElementById("res").innerHTML=a/b;
		}
	</script>
	
	<h1>CALCULATOR</h1>

	<input type="number" value="" id="num1"><br><br>
	
	<input type="number" value="" id="num2"><br><br>
	<input type="button" value="+" onclick = "return plus()">
	<input type="button" value="-" onclick = "return minus()">
	<input type="button" value="*" onclick = "return mul()">
	<input type="button" value="/" onclick = "return divid()">
	<br><br>
	Result is : <span id = "res"></span>
</body>
</html>