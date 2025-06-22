CREATE DATABASE flappybirddb;
USE flappybirddb;

CREATE TABLE IF NOT EXISTS scores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    player_name VARCHAR(100) NOT NULL,
    score INT NOT NULL,
    play_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT player_name, score, play_time
FROM Scores
ORDER BY play_time DESC;

SELECT player_name, score
FROM Scores
ORDER BY score DESC
LIMIT 1;


