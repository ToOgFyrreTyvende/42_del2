/*fetch("/rest/test").then(function(response){
})
fetch("/rest/test/json").then(function(response){
})*/

// this does not
new Vue({
    el: '#container',
    data () {
        return {
            loading: true,
            loaded: false,
            msg: "Terninge spil!",
            game: {
                started: 0,
                turn: 0,
                player1: "Player 1",
                player2: "Player 2",
            }
        }
    },
    created () {
        // fetch the data when the view is created and the data is
        // already being observed
        this.fetchData()
    },
    methods: {
        fetchData() {
           this.loading = false;
           this.loaded = true;
        },
        setPlayerName(id, name){
            console.log("mem " + name + " " + id);
        }
    }
})