<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF -8">
<title>PLANET BIKE </title>

<meta name="viewport" content="width= device-width,initial-scale= 1.0">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="js/respond.js.js"></script>
<body>
<div class="container">
   <!--row1 -->
   <header class="row">
   <div class="col-lg-6 col-sm-5">
   <a href="#"><img src="C:\Users\user1\Pictures\bike img\images (3).png" alt="Planet Bike"></a>
   </div>
   <div class="col-lg-6 col-sm-7">
   <img src="C:\Users\user1\Pictures\bike img\bike logo.jpg" alt="welcome to Bike world">
   </div>
   
	<style>
#the-slider img {
	width: 50%;
}

a {
	color: #powder blue;
	text-decoration: none;
}

a {
	background-color: rgb(51, 122, 183);
}
body{
font-size: 18px;
}
</style>
	<div class="container">
		<!----row1---->

		
			<div class="col-lg-6 col-xs-6">
				<h1>LOGIN</h1>
				   <form:form name="submitForm" method="POST">
        <div align="center">
            <table>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>
			</div>
		</header>

		<div class="navbar navbar-default row">
			<ul class="nav nav-pills nav-justified">
				<li class="active"><a href="">Home</a></li>
				<li><a href="Product.jsp">Products</a></li>
				<li><a href="">Services</a></li>
				<li><a href="">Contacts</a></li>
			</ul>
		</div>
		


		<!--row2--->
		<header class="row">
			<div class="col-lg-4 col-xs-8 ">
				<a href='#'><imgsrc=C:\Users\user1\Pictures\bike img\login pages_"
					alt=""></a>
			</div>

		<div class="jumbotron">
		
			<h1>Planet Bike</h1>            
			<h2>Ducati World</h2>

		</div>
		</div>
		<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div id="the-slider" class="carousel slide" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#the-slider" data-slide-to="0" class="active"></li>
						<li data-target="#the-slider" data-slide-to="1"></li>
						<li data-target="#the-slider" data-slide-to="2"></li>
					</ol>
					

					<div class="carousel-inner">

						<div class="item active">
							<img 
								src="C:\Users\user1\Pictures\bike img\images (22).jpg"
								alt=" ">
						</div>
						<!---item1--->

						<div class="item">
							<img 
								src="C:\Users\user1\Pictures\bike img\images (26).jpg"
								alt=" ">
						</div>
						<!---item2--->

						<div class="item">
							<img 
								src="C:\Users\user1\Pictures\bike img\images (6).jpg"
								alt=" ">
						</div>
						<!---item3--->
						<div class="item">
							<img 
								src="C:\Users\user1\Pictures\bike img\Ducati-959-Panigale.jpg"
								alt=" ">
						</div>
						<!---item4--->
						

					</div>
					<!---carousel-inner--->
					<!---controls---->
					<a class="left carousel-control" href="#the-slider" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left"> </span>
					</a> <a class="right carousel-control" href="#the-slider" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right"> </span>
					</a>
				</div>
			</div>
		</div>
		</div>
		<!---slider--->

        <!---row3---->
		<div class="container">
		<div class="content row">
			<div class="col-sm-3">
				<p>
					<img class="thumbnail" class="caption"
						src="C:\Users\user1\Pictures\bike img\images (7).jpg"
						alt=" ">
				</p>
				<h4>Yamaha Fazer</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='#'>Read more</a>
				</p>
			</div>

			<div class="col-sm-3">
				<p>
					<img class="thumbnail" class="caption"
						src="C:\Users\user1\Pictures\bike img\images (26).jpg"
						alt=" ">
				</p>
				<h4>YAMAHA R15</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='#'>Read more</a>
				</p>
			</div>

			<div class="col-sm-3 ">
				<p>
					<img class="thumbnail" class="caption"
						src="C:\Users\user1\Pictures\bike img\images (28).jpg"
						alt=" ">
				</p>
				<h4>SUZUKI</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='#'>Read more</a>
				</p>
			</div>

			<div class="col-sm-3 ">
				<p>
					<img class="thumbnail" class="caption"
						src="C:\Users\user1\Pictures\bike img\images (27).jpg"
						alt=" ">
				</p>
				<h4>HONDA CBR</h4>
				<p></p>
				<p>
					<a class="btn btn-primary" href='#'>Read more>></a>
				</p>
			</div>

		</div>
		</div>
		<!---row--->
		<footer class="container">
		<div class="jumbotron">
		<div class="row">
		 	<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-usd">Cash on delievery </span></large></h>
				</div>
				<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-time">On time delievery </span></large></h>
				</div>
				<div class="col-xs-4">
				<h><large><span  class="glyphicon glyphicon-refresh">Easy returns</span></large></h>
			</div>
		</div>
		</div>
	</footer>
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>


<%@include file="footer.jsp"%>
