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
package com.redthirddivision.firestorm.entities;

import java.awt.Graphics;

import com.redthirddivision.firestorm.rendering.textures.Sprite;
import com.redthirddivision.firestorm.states.GameState;

/**
 * <strong>Project:</strong> Firestorm <br>
 * <strong>File:</strong> Entity.java
 *
 * @author <a href = "http://redthirddivision.com/team/blp"> Matthew Rogers</a>
 */
public abstract class Entity {

    protected double x, y;
    protected Sprite sprite;
    protected GameState state;
    
    public Entity(Sprite sprite, double x, double y, GameState state) {
        this.sprite = sprite;
        this.x = x;
        this.y = y;
        this.state = state;
        state.addEntity(this);
    }
   
    public abstract void tick();
    
    public void render(Graphics g){
        sprite.render(g, x, y);
    }
    
}