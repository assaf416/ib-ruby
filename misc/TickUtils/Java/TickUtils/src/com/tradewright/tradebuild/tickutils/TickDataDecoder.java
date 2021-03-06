/* Copyright 2008 Richard L King
 *
 * This file is part of TradeBuild Tick Utilities Package.
 *
 * TradeBuild Tick Utilities Package is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 *
 * TradeBuild Tick Utilities Package is distributed in the hope that it will 
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TradeBuild Tick Utilities Package.  If not, see 
 * <http://www.gnu.org/licenses/>.
 */

package com.tradewright.tradebuild.tickutils;

/**
 * This interface is implemented by classes that provide the ability to decode encoded tick data segments.
 */
public interface TickDataDecoder {

    /* ================================================================================
     * Constants
     * ================================================================================
     */

    /* ================================================================================
     * Interfaces
     * ================================================================================
     */

    /* ================================================================================
     * Classes
     * ================================================================================
     */

    /* ================================================================================
     * Methods
     * ================================================================================
     */

    /**
     * Returns the next tick from the encoded data segment.
     * @return The next tick from the encoded data segment.
     */
    Tick getNextTick();
    
}
