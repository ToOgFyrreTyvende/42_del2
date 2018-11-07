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
                id: 0,
                started: 0,
                turn: 0,
                player1: {
                    name: "Player 1",
                    money: 0,
                    field: 0
                },
                player2: {
                    name: "Player 2",
                    money: 0,
                    field: 0
                },
                moves: []
            }
        }
    },
    created () {
        // fetch the data when the view is created and the data is
        // already being observed
        this.game.id = Math.ceil(Math.random()*10000);
        //this.startGame();
        this.fetchData();
    },
    methods: {
        fetchData() {
           this.loading = false;
           this.loaded = true;
        },
        setPlayerName(id, name){
            console.log("mem " + name + " " + id);
        },
        playRound(){
            fetch('/rest/game/round', {
                method: 'post',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    id: this.game.id
                })
            }).then((response) => response.json())
                .then((result) => {
                    this.setData(result, (this.game.turn === 1 ? 2 : 1), true);
                })
        },
        startGame(){
            this.game.started = true;
            fetch('/rest/game', {
                method: 'post',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    id: this.game.id,
                    player1: this.game.player1.name,
                    player2: this.game.player2.name
                })
            }).then((response) => response.json())
                .then((result) => this.setData(result, 1, false))
                .catch((err) => {
                    this.game.started = true;
                    console.error(err);
                })
        },
        setData(result, turn, isRound) {
            if (isRound){
                this.game.player1.money = result.p1Cash;
                this.game.player2.money = result.p2Cash;
                this.game.player1.field= result.p1Field;
                this.game.player2.field= result.p2Field;
                this.game.moves.push([this.game.turn, result.text]);
                this.game.turn = turn;
            }else{
                this.game.player1.money = result.p1Cash;
                this.game.player2.money = result.p2Cash;
                this.game.player1.field= result.p1Field;
                this.game.player2.field= result.p2Field;
                this.game.turn = turn;
            }
        }
    }
})