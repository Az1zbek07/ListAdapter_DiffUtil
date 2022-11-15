package com.example.listadapterdiffutil.adapter

import androidx.annotation.StringRes
import com.example.listadapterdiffutil.R
import com.example.listadapterdiffutil.SportsData

object Constants {
    fun sports(): MutableList<SportsData>{
        return mutableListOf(
            SportsData(
                "Rugby",
                "19th century",
                R.drawable.rugby_image,
                "Canadian football and, to a lesser extent, American football were once considered forms of rugby football, but are seldom now referred to as such. The governing body of Canadian football, Football Canada, was known as the Canadian Rugby Union as late as 1967, more than fifty years after the sport parted ways with rugby rules.[1][2][3]\n" +
                        "\n" +
                        "Rugby football started about 1845 at Rugby School in Rugby, Warwick\\'s, England, although forms of football in which the ball was carried and tossed date to the Middle Ages (see medieval football).[4] Rugby football spread to other English public schools in the 19th century and across the British Empire as former pupils continued to play it.\n" +
                        "\n" +
                        "Rugby football split into two codes in 1895, when twenty-one clubs from the North of England left the Rugby Football Union to form the Northern Rugby Football Union (renamed the Rugby Football League in 1922) at the George Hotel, Huddersfield, over payments to players who took time off work to play (\"broken-time payments\"), thus making rugby league the first code to turn professional and pay players.[5] Rugby union turned professional one hundred years later, following the 1995 Rugby World Cup in South Africa.[6][7] The respective world governing bodies are World Rugby (rugby union) and the Rugby League International Federation (rugby league)"
            ),
            SportsData(
                "Cricket",
                "16th century",
                R.drawable.cricket_image,
                "Cricket is a bat-and-ball game played between two teams of eleven players on a field at the centre of which is a 22-yard (20-metre) pitch with a wicket at each end, each comprising two bails balanced on three stumps. The batting side scores runs by striking the ball bowled at one of the wickets with the bat and then running between the wickets, while the bowling and fielding side tries to prevent this (by preventing the ball from leaving the field, and getting the ball to either wicket) and dismiss each batter (so they are \"out\"). Means of dismissal include being bowled, when the ball hits the stumps and dislodges the bails, and by the fielding side either catching the ball after it is hit by the bat, but before it hits the ground, or hitting a wicket with the ball before a batter can cross the crease in front of the wicket. When ten batters have been dismissed, the innings ends and the teams swap roles. The game is adjudicated by two umpires, aided by a third umpire and match referee in international matches. They communicate with two off-field scorers who record the match's statistical information"
            ),
            SportsData(
                "Hockey",
                "19th century",
                R.drawable.hockey_image,
                "Hockey is a term used to denote various types of both summer and winter team sports which originated on either an outdoor field, sheet of ice, or dry floor such as in a gymnasium.\n" +
                        "\n" +
                        "There are many types of hockey. Some games make the use of skates, either wheeled, or bladed while others do not. In order to help make the distinction between these various games, the word \"hockey\" is often preceded by another word i.e. \"field hockey\", \"ice hockey\", \"roller hockey\", \"rink hockey\", or \"floor hockey\".\n" +
                        "\n" +
                        "In each of these sports, two teams play against each other by trying to manoeuvre the object of play, either a type of ball or a disk (such as a puck), into the opponent's goal using a hockey stick. Two notable exceptions use a straight stick and an open disk (still referred to as a \"puck\") with a hole in the center instead. The first case is a style of floor hockey whose rules were codified in 1936 during the Great Depression by Canada's Sam Jacks"
            ),
            SportsData(
                "Basketball",
                "December 21, 1891",
                R.drawable.bassketball_image,
                "Basketball is a team sport in which two teams, most commonly of five players each, opposing one another on a rectangular court, compete with the primary objective of shooting a basketball (approximately 9.4 inches (24 cm) in diameter) through the defender\\'s hoop (a basket 18 inches (46 cm) in diameter mounted 10 feet (3.048 m) high to a backboard at each end of the court, while preventing the opposing team from shooting through their own hoop. A field goal is worth two points, unless made from behind the three-point line, when it is worth three. After a foul, timed play stops and the player fouled or designated to shoot a technical foul is given one, two or three one-point free throws. The team with the most points at the end of the game wins, but if regulation play expires with the score tied, an additional period of play (overtime) is mandated"
            )
        )
    }
}