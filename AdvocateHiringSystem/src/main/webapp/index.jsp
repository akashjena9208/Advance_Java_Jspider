<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Adavocat Hiring System</title>
<link rel="stylesheet" href="style.css">

  <link rel="icon" href="img/favicon.jpg">
  <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Lato&family=Montserrat:ital,wght@0,100;0,300;0,400;0,500;0,600;0,700;1,100;1,200&display=swap"
        rel="stylesheet">
    <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato&family=Montserrat:ital,wght@0,100;0,300;0,400;0,500;0,600;0,700;1,100;1,200&family=Sedan:ital@0;1&display=swap" rel="stylesheet">
    <style>      
    </style>
    
    
</head>
<body>


	 <!--------- Nav-Bar ---------->
  <section class="main" id="main">

    <section class="Nav_Bar" data-scroll data-scroll-speed="-5">
      <div class="nav">
        <nav>
          <h1>Nyaya</h1>
          <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="#about-us">About Us</a></li>
            <li><a href="#contact-us">Contact Us</a></li>
          </ul>
          <ol>
            <li><a href="login.jsp" style="background-color: #80BCBD ;">Login / SignUp</a></li>
            <!--<li><a href="advocate.html" style="background-color: #00A9FF;">Join As Profesional</a></li>-->
          </ol>
        </nav>
      </div>

      <!------- Tagline -------->

        <div class="tagline">
          <h2>We <span style="color: green;">Fight</span> <br> For Your <span style="color: green;">Rights.</span> </h2>
          <br>
          <a href="">Learn More..</a>
        </div>
    </section>
      
    <!-- About -->

    <section class="about-us" id="about-us">
      <h2>About us</h2>
      <div class="about-row">
          <div class="about-col">
              <h2>We Are The World's Best Legal Adviser.</h2>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod ex vel
                  metus tincidunt bibendum. Praesent eget enim vitae velit sagittis aliquam ac a
                  tellus. Lorem ipsum dolor, sit amet consectetur adipisicing elit.
                  Distinctio quidem nostrum odit dolor nulla ipsum sequi obcaecati sit vitae quod tenetur,
                  eligendi perferendis illo quas hic iure aperiam ut voluptate.</p>

              <a href="index.jsp">EXPLORE NOW</a>
          </div>
          <div class="about-col">
              <img src="https://pbs.twimg.com/media/EAZYClTU0AAy3AN.jpg" alt="about" height="350px" width="470px">
          </div>
      </div>
  </section>

    
    <!-------- Contact Section Start ----------->
    <section class="contact">
      <div class="map1">
          <iframe
              src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3025.4708556709243!2d-73.82241512443659!3d40.68562653923045!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c26749046ee14f%3A0xea672968476d962c!2s123rd%20St%2C%20Queens%2C%20NY%2C%20USA!5e0!3m2!1sen!2sin!4v1694589297518!5m2!1sen!2sin"
              width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"
              referrerpolicy="no-referrer-when-downgrade"></iframe>
      </div>
  </section>

  <section class="contact-us" id="contact-us">
       <h2>Contact Us</h2>    
      <div class="contact-row">
          <div class="contact-col">
              <div>
                  <i class="fa-sharp fa-solid fa-house"></i>
                  <span>
                      <h5>Nyaya:Conquare The Truth</h5>
                      <p>
                          123 Street, New York, USA
                      </p>
                  </span>
              </div>
              <div>
                  <i class="fa-solid fa-phone"></i>
                  <span>
                      <h5>+012 345 6789 / 274 0386 / 274 4407</h5>
                      <p>
                          Fax: +91 674 2740828
                      </p>
                  </span>
              </div>
              <div>
                  <i class="fa-solid fa-envelope"></i>
                  <span>
                      <h5>Connect with us: </h5>
                      <p>
                          Email: info@example.com (Official)<br>
                          admissioninfo@example.com (Admission) <br>
                          verification@example.com ( verification)
                      </p>
                  </span>
              </div>
          </div>

          <div class="contact-col">
              <form>

                  <input type="text" name="Name" placeholder="Enter Your Name" required><br><br>
                  <input type="email" name="Email" placeholder="Enter Your email address" required><br>
                  <textarea rows="5" cols="50" name="Message" placeholder="Write your message here..."
                      required></textarea><br>
                  <button id='submit' type="submit">Send Message</button>
              </form>
          </div>
      </div>
  </section>



  </section>
  <!------- Footer ------->

  <footer>
    <div class="content">
      <div class="top">
        <div class="logo-details">
          <span class="logo_name">Nyaya</span>
        </div>
        <div class="media-icons">
          <a href="https://www.facebook.com/koustuvgroup.official/"><i class="fab fa-facebook-f"></i></a>
          <a href="https://twitter.com/koustuv_group"><i class="fab fa-twitter"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="https://www.linkedin.com/in/koustuvgroupofficial/"><i class="fab fa-linkedin-in"></i></a>
          <a href="https://www.youtube.com/channel/UCmOeavvPbFAbm0-21RgspIQ/videos"><i class="fab fa-youtube"></i></a>
        </div>
      </div>
      <div class="link-boxes">
        <ul class="box">
          <li class="link_name">Company</li>
          <li><a href="index.html">Home</a></li>
          <li><a href="#contact-us">Contact us</a></li>
          <li><a href="#about-us">About us</a></li>
          <li><a href="index.html">Get started</a></li>
        </ul>
        <ul class="box">
          <li class="link_name">Services</li>
          <li><a href="#">Property Registration</a></li>
          <li><a href="#">Crime Investigation</a></li>
          <li><a href="#">Legal Notice</a></li>
          <li><a href="#">Bail </a></li>
        </ul>
        <ul class="box">
          <li class="link_name">Account</li>
          <li><a href="#">Profile</a></li>
          <li><a href="#">My account</a></li>
          <li><a href="#">Prefrences</a></li>
          <li><a href="#">Purchase</a></li>
        </ul>
        <ul class="box">
          <li class="link_name">Domains</li>
          <li><a href="#">Personal</a></li>
          <li><a href="#">Bussiness</a></li>
          <li><a href="#">Commorcial</a></li>
          <li><a href="#">Others</a></li>
        </ul>
        <ul class="box input-box">
          <li class="link_name">Subscribe</li>
          <li><input type="text" placeholder="Enter your email"></li>
          <li><input type="button" value="Subscribe"></li>
        </ul>
      </div>
    </div>
    <div class="bottom-details">
      <div class="bottom_text">
        <marquee style="width:30%"><span class="copyright_text">Copyright © 2023 <a href="#">Nyaya</a>All rights
            reserved</span></marquee>
        <span class="policy_terms">
          <a href="#">Privacy policy</a>
          <a href="#">Terms & condition</a>
        </span>
      </div>
    </div>
  </footer>


  <!-- script tags -->

  <script src="script.js"></script>
</body>
</html>