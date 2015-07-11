/*   Copyright 2015 Matthew Rogers "BossLetsPlays"
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
package com.redthirddivision.firestorm.states;

import java.awt.Graphics;
import java.util.ArrayList;

import com.redthirddivision.firestorm.entities.Entity;
import com.redthirddivision.firestorm.entities.Player;
import com.redthirddivision.firestorm.rendering.textures.Sprite;

/**
 * <strong>Project:</strong> Firestorm <br>
 * <strong>File:</strong> GameState.java
 *
 * @author <a href = "http://redthirddivision.com/team/blp"> Matthew Rogers</a>
 */
public class GameState implements State {
    
    private ArrayList<Entity> entities;

    @Override
    public void init() {
        entities = new ArrayList<Entity>();
        new Player(new Sprite("test"), 100, 100, this);
    }

    @Override
    public void enter() {}

    @Override
    public void tick(StateManager stateManager) {
        for(Entity e : entities)
            e.tick();
    }

    @Override
    public void render(Graphics g) {
        for(Entity e : entities)
            e.render(g);
    }

    @Override
    public void exit() {
        entities.clear();
    }

    @Override
    public String getName() {
        return "level1";
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

}