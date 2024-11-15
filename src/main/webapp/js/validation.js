$(document).ready(function() {
    $('#loginForm').on('submit', function() {
        if ($('#userId').val() === '' || $('#password').val() === '') {
            alert('User ID and Password are required');
            return false;
        }
        return true;
    });
});
