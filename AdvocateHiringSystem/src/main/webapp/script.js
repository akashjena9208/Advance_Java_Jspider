document.addEventListener('DOMContentLoaded', (event) => {
  document.getElementById('login').addEventListener('submit', function(e) {
      e.preventDefault();
      
      // Get the selected user role
      var userRole = document.querySelector('input[name="login"]:checked').value;


      // Redirect to the corresponding dashboard based on the user role
      if (userRole === 'User') {
          window.location.href = 'user-dashbord.html';
      } else if (userRole === 'Advocate') {
          window.location.href = 'advocate-dashboard.html';
      } else if (userRole === 'Admin') {
          window.location.href = 'admin-dashbord.html';
      }
  });
});