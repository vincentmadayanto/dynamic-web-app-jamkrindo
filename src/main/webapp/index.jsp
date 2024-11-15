<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="css/styles.css"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<form class="formLogin" action="login" method="post">
    <section>
        <p>Login</p>
    </section>
    <section>
        <label for="userId">User ID:</label>
        <input type="text" name="userId" id="userId" placeholder="enter username">
    </section>
   <section>
       <label for="password">Password:</label>
       <input type="password" name="password" id="password" placeholder="enter password">
   </section>
    <button type="submit">Login</button>
</form>
<script>
    $(document).ready(function() {
        $("form").submit(function(event) {
            // Clear previous error messages
            $(".error").remove();

            const userId = $("#userId").val();
            const password = $("#password").val();

            // Simple validation
            if (userId.trim() === "") {
                $("#userId").after("<span class='error'>User ID is required</span>");
                event.preventDefault(); // Prevent form submission
            }
            if (password.trim() === "") {
                $("#password").after("<span class='error'>Password is required</span>");
                event.preventDefault(); // Prevent form submission
            }
        });
    });
</script>

</body>
</html>
