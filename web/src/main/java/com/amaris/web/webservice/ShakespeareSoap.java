/**
 * ShakespeareSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amaris.web.webservice;

public interface ShakespeareSoap extends java.rmi.Remote {

    /**
     * GetSpeech requires a string formatted phrase from one of Shakespeare's
     * plays as input. The speech, speaker, and play will be returned as
     * an XML string. Sample Shakespeare Phrases: To be, or not to be | My
     * kingdom for a horse | Get thee to a nunnery | There are more things
     * in heaven and earth | I will wear my heart upon my sleeve | When beggars
     * die, there are no comets seen | Lord, what fools these mortals be
     * | Et tu, Brute | Sound and fury | Friends, romans, countrymen | Something
     * wicked this way comes | To sleep: perchance to dream | Green-eyed
     * monster | This was the noblest Roman of them all | Oft expectation
     * fails and most oft there Where most it promises | Eye of newt and
     * toe of frog | Frailty, thy name is woman | What light through yonder
     * window breaks | Think you I am no stronger than my sex | Cowards die
     * many times before their deaths | How poor are they that have not patience
     * | Quality of mercy | My words fly up, my thoughts remain below | Bell,
     * book, and candle | Something is rotten in the state of Denmark | Beware
     * the ides of March | A stage where every man must play a part | Though
     * this be madness, yet there is method in 't | Is this a dagger which
     * I see before me | Now go we in content To liberty and not to banishment
     * | Band of brothers | Alas, poor Yorick! I knew him | The world's mine
     * oyster | Nothing will come of nothing | That man that hath a tongue
     * | All the world's a stage | The course of true love never did run
     * smooth | Love looks not with the eyes, but with the mind | Let every
     * eye negotiate for itself | Kiss me, Kate | The play 's the thing |
     * I am constant as the northern star | The man that hath no music in
     * himself | We are such stuff As dreams are made on | This was the most
     * unkindest cut of all | Journeys end in lovers meeting | Yond Cassius
     * has a lean and hungry look | My only love sprung from my only hate
     * | I am fortune's fool | Loved not wisely but too well | O coward conscience,
     * how dost thou afflict me | When shall we three meet again | A plague
     * o' both your houses | Out, damned spot | To-morrow, and to-morrow,
     * and to-morrow | Our remedies oft in ourselves do lie | Not that I
     * loved Caesar less | Winter of our discontent | Parting is such sweet
     * sorrow | O Romeo, Romeo! wherefore art thou Romeo | The lady protests
     * too much, methinks | What a piece of work is a man | The fault, dear
     * Brutus, is not in our stars | All that glitters is not gold | What's
     * in a name | Thus with a kiss I die
     */
    public java.lang.String getSpeech(java.lang.String request) throws java.rmi.RemoteException;
}
