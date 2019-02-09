var app = new Vue({
    el: '#app',
    data: {
        info: 'Saime juhusliku arvu.'
    }
});

var xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var response = this.responseText;
        app.info = response;
    }
};
xhttp.open("GET", "http://localhost:8080/num", true);
xhttp.send();


