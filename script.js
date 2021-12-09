const d4 = document.getElementById('d4')
const d6 = document.getElementById('d6')
const d8 = document.getElementById('d8')
const d10 = document.getElementById('d10')
const d12 = document.getElementById('d12')
const d20 = document.getElementById('d20')
const d100 = document.getElementById('d100')
const dpercent = document.getElementById('dpercent')

const buttons = document.querySelectorAll('button')



buttons[0].addEventListener('click', () =>{
    numberOfSides = 4
    numberDisplay(d4) 
})

buttons[1].addEventListener('click', () =>{
    numberOfSides = 6
    numberDisplay(d6) 
})

buttons[2].addEventListener('click', () =>{
    numberOfSides = 8
    numberDisplay(d8) 
})

buttons[3].addEventListener('click', () =>{
    numberOfSides = 10
    numberDisplay(d10) 
})

buttons[4].addEventListener('click', () =>{
    numberOfSides = 12
    numberDisplay(d12) 
})

buttons[5].addEventListener('click', () =>{
    numberOfSides = 20
    numberDisplay(d20) 
})

buttons[6].addEventListener('click', () =>{
    numberOfSides = 100
    numberDisplay(d100) 
})

buttons[7].addEventListener('click', () =>{
    numberOfSides = 10

    if(document.querySelector("#dpercent > p")){
        document.querySelector("#dpercent > p").remove()
        }

    let roll = random(numberOfSides)
    let text = document.createElement('p')
    text.innerText = roll + '0'
    dpercent.appendChild(text) 

})

function numberDisplay(dice){

    if(document.querySelector(`#d${numberOfSides} > p`)){
        document.querySelector(`#d${numberOfSides} > p`).remove()
    }

    let roll = random(numberOfSides)
    let text = document.createElement('p')
    text.innerText = roll
    dice.appendChild(text)
}

function random(numberOfSides){
    return Math.ceil(Math.random() * numberOfSides)
}
