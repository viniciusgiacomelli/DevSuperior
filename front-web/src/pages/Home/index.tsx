import React from 'react';
import {ReactComponent as ArrowIcon} from '../../assets/arrow.svg';
import {ReactComponent as Gamer} from '../../assets/gamer.svg';
import { Link } from 'react-router-dom';
import './styles.css';

const Home = () =>(
    <div className="home-container">
        <div className="home-text">
            <h1 className="home-text-title">
                Quais jogos a galera gosta mais?
            </h1>
            <h3 className="home-text-subtitle">
                Clique no botão abaixo e descubra!
            </h3>
            <Link to="/records">
                <div className="home-actions">
                    <button className="home-btn"> QUERO DESCOBRIR </button>
                    <div className="home-btn-icon">
                        <ArrowIcon/>
                    </div>
                </div>
            </Link>
        </div>
        <Gamer className="home-image"/>
    </div>
);

export default Home;